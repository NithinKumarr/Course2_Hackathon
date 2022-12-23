public class SortingCities {
    public static void main(String[] args) {
        SortingCities sortingCities=new SortingCities();
        String[]cities={"Bern","Lucerne","Interlaken","Grindelwald","Engelberg","Geneva","Murren","Basel","Zermatt","Jungfraujoch"};
        int[]distance={138,52,118,136,85,276,103,87,214,101};
//        String uppercaseCities=SortingCities.convertToUppercaseCities(cities);
//        String[] uppercaseCities=SortingCities.convertToUppercaseCities(cities);
//        String cityFar52kM=SortingCities.city52kMFromzurich(cities,distance);
//        String citygreaterthanorequalto270kmFromzurich=SortingCities.citygreaterthanorequalto270kmFromzurich(cities,distance);
    }
    public String[] convertToUppercaseCities(String[] cities)
    {
        String[] upper=new String[cities.length];
        for(int i=0;i<cities.length;i++)
        {
            upper[i]=cities[i].toUpperCase();
        }
        return upper;
    }
    public String city52kMFromzurich(String[] cities,int[] distance)
    {
        String cityFar52="";
        for(int i=0;i<distance.length;i++)
        {
            if(distance[i]==52)
            {
                cityFar52=cities[i];
            }
        }
        return cityFar52;
    }
    public String citygreaterthanorequalto270kmFromzurich(String[] cities,int[] distance)
    {
        String citygreaterthanorequalto270="";
        for(int i=0;i<distance.length;i++)
        {
            if(distance[i]>=270)
            {
                citygreaterthanorequalto270=cities[i];
            }
        }
        return citygreaterthanorequalto270;
    }
}