package weather;

public class weather {
    public static void main(String[] args){

        String town = "Minsk, Belarus ";
        String Today = "Wed, Sep 14: ";
        String Tomorrow = "Thu, Sep 15:";
        String WeatherToday = " Light rain. Gentle Breeze.";
        String WeatherTomorrow = " Broken clouds. Gentle Breeze.";
        String Slash = "/";
        int DayTemperature = 15;
        int NightTemperature = 9;

        System.out.println(town+"\n"
            + Today + WeatherToday + "\t" + DayTemperature + "\u00b0C" + Slash + NightTemperature + "\u00b0C" );

        DayTemperature = 19;
        NightTemperature = 9;

        System.out.println(Tomorrow + WeatherTomorrow + "\t" + DayTemperature + "\u00b0C" + Slash + NightTemperature + "\u00b0C" );

    }


}
