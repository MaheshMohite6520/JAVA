class Distance 
{
	public static void main(String[] args) 
	{
		double distanceInKm = 1.7623;
		double stepDistanceInMeter = 0.834;

		double distanceInMeter = distanceInKm * 1000;

		int noOfSteps = (int) (distanceInMeter / stepDistanceInMeter) ;

		System.out.println("Approximate number of steps to complete " + distanceInKm + "km"+ " are: " + noOfSteps);
	}
}
