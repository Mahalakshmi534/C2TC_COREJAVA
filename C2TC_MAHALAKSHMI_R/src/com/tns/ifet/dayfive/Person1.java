package com.tns.ifet.dayfive;

public class Person1 {
		private String name;
		private String city;

		public Person1() {
			System.out.println("Person class default constructor");
			name="Amit";
			city="Pune";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		@Override
		public String toString() {
			return "Person1 [name=" + name + ", city=" + city + "]";
		}

}
