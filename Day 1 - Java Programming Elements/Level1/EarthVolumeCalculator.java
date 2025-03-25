public class EarthVolumeCalculator {
    public static void main(String[] args) {
        int radiusOfEarthInKm = 6378;
        double radiusOfEarthInMiles = radiusOfEarthInKm/1.609;
        double volumeOfEarthInKm = (4.0/3) * Math.PI * (radiusOfEarthInKm * radiusOfEarthInKm * radiusOfEarthInKm);
        double volumeOfEarthInMiles = (4.0/3) * Math.PI * (radiusOfEarthInMiles * radiusOfEarthInMiles * radiusOfEarthInMiles);
        System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarthInKm +" and cubic miles is " + volumeOfEarthInMiles );
    }
}
