package practice;

public class Person {

		private String name;
		private int age;
		private boolean ismale;
		
		Person(){
			
		}
		
		Person(String name, int age, boolean ismale){
			this.name = name;
			this.age = age;
			this.ismale = ismale;
		}
		
		public void detailsOfPerson() {
			System.out.println("Name : "+name);
			System.out.println("Age : "+age);
			System.out.println(ismale);
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public boolean isIsmale() {
			return ismale;
		}

		public void setIsmale(boolean ismale) {
			this.ismale = ismale;
		}
}
