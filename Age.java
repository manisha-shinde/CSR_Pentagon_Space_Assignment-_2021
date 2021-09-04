class Age 
{
	public static void main(String[] args) 
	{
		int first_person=25,
		    second_person=34,
			third_person=45;
			if(first_person>second_person&&first_person>third_person)
				System.out.println("First Person is Oldest="+first_person);
			else if(second_person>first_person&&second_person>third_person)
				System.out.println("Second Person is Oldest="+second_person);
			else
			System.out.println("Third Person is Oldest="+third_person);

	}
}
