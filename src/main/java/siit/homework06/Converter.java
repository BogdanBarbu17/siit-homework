package siit.homework06;

import java.util.HashMap;
import java.util.Map;

public class Converter {
    private static Map<String, Double> convertingMap = new HashMap<>();

    static {
        convertingMap.put("km", 1000000.0);
        convertingMap.put("m", 1000.0);
        convertingMap.put("dm", 100.0);
        convertingMap.put("cm", 10.0);
        convertingMap.put("mm", 1.0);
        convertingMap.put("mm_km", 0.000001);
        convertingMap.put("mm_m", 0.001);
        convertingMap.put("mm_dm", 0.01);
        convertingMap.put("mm_cm", 0.1);
        convertingMap.put("mm_mm", 1.0);
    }

    /***
     * convert the given value to millimeters by matching the unit given to the unit in the above map
     * we will use this to convert all the given values to a common unit of measure
     * @param value the value to be converted to millimeters
     * @param unit the original unit of measure to be compared to the map
     * @throws ConversionException
     */
    public static double convertToMillimeters(double value, String unit) throws ConversionException {
        Double factor = convertingMap.get(unit);

        if (factor != null) {
            return value * convertingMap.get(unit);
        } else {
            throw new ConversionException("Factor undefined");
        }
    }

    /***
     * converts the value given to a required unit of measure
     * if the unit o measure is not given the value it will be converted to millimeters
     * @param resultIn unit o measure to be converted in
     * @param value value to be converted to a specific unit of measure
     * @return converted value
     */
    public static double convertToRequiredUnit(String resultIn, double value) {
        Double factor = convertingMap.get("mm_" + resultIn);

        if (factor != null) {
            return value * convertingMap.get("mm_" + resultIn);
        } else {
            return value * convertingMap.get("mm_mm");
        }
    }

}
