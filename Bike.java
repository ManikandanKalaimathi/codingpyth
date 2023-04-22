class Bike 
{
	    int engno;
		String color;
		int cost;

		void start()
		{
			System.out.println("Bike is Started");
		}
		void move()
		{
			System.out.println("Bike is Moved");
		}
		void stop()
		{
			System.out.println("Bike is Stoped");
		}

		public static void main(String[] args) 
	{
		

		Bike b1 = new Bike();
		Bike b2 = new Bike();

		b1.start();
		b1.stop();

		b2.start();
		b2.move();

		new Bike().stop();
	}

}
