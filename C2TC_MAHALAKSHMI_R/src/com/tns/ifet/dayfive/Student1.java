package com.tns.ifet.dayfive;
public class Student1 extends Person1
	{
		private String clas;
		private float per;
		public Student1() {
			System.out.println("Student class default constructor");
			clas="FY";
			per=70;
		}
		public Student1(String clas, float per) {
			this.clas = clas;
			this.per = per;
		}
		public String getClas() {
			return clas;
		}
		public void setClas(String clas) {
			this.clas = clas;
		}
		public float getPer() {
			return per;
		}
		public void setPer(float per) {
			this.per = per;
		}
		@Override
		public String toString() {
			return "Student1 [clas=" + clas + ", per=" + per + "]";
		}

}
