package siit.homework06;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
     List<String> operatorSign = new ArrayList<>();
     List<Double> expressionValue = new ArrayList<>();

    /***
     * Extract from a given String a group by matching it with a regex pattern
     * the group is further split into composing elements that match the given regex pattern
     * than the element is added to specific lists
     * the method 'calculate' is called to calculate the result
     * after the resul is calculated the lists that hold the elements will be emptied so that
     * the next input can be correct calculated
     * in the end we check if we have a required unit of measure that the output to be displayed in
     * if we do, we convert it in the required unit of measure, if not we display it in millimeters
     * @param input String input given by the user to be calculated
     * @param resultIn Required unit of measure the result to be converted in
     * @throws ConversionException
     */
    public double calculateFinal(String input, String resultIn) throws ConversionException {

        Pattern pattern = Pattern.compile("([\\+|-]?\\s*\\d+\\s*(mm|cm|dm|km|m)?)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String group = matcher.group();

            String operator = extract(group, "[\\+|-]");
            operatorSign.add(operator);

            String unit = extract(group, "(mm|cm|dm|m|km)");

            double value = Double.parseDouble(extract(group, "\\d+"));
            expressionValue.add(Converter.convertToMillimeters(value, unit));
        }

        double result = calculate();

        expressionValue.removeAll(expressionValue);
        operatorSign.removeAll(operatorSign);


        if (resultIn == null || resultIn.equals(" ")) {
            System.out.println(result);
            return result;
        } else {
            result = Converter.convertToRequiredUnit(resultIn, result);
            System.out.println(result);
            return result;
        }

    }


    /***
     * iterates the list of values and the list of signs and calculates the result
     * by matching the value with the corresponding operator
     * @return calculated result
     */
    public Double calculate() {

        Double result = 0.0;

        for (int i = 0; i < expressionValue.size(); i++) {
            String operator = operatorSign.get(i);

            if (operator.equals("+")) {
                result += expressionValue.get(i);
            } else {
                result -= expressionValue.get(i);
            }
        }
        return result;
    }


    /***
     * extract from a given String a specific group based on a pattern given
     * if the pattern searched is an operator and the String does not have one we assume the operator is '+'
     * @param group the String to be search in
     * @param toSearch the pattern to search
     * @return the pattern found or the operator '+'
     */
    public String extract(String group, String toSearch) {

        Pattern pattern = Pattern.compile(toSearch);
        Matcher matcher = pattern.matcher(group);

        if (matcher.find()) {
            return matcher.group();
        } else {
            return "+";
        }
    }


}
