package com.sai.training;

public class MedicineInfo {
	public void displayLabel(){
		System.out.println("Company : Apolo");
		System.out.println("Address : Chittoor");
		}
	}
class Tablet extends MedicineInfo{
		 
		public void displayLabel()
		{
			
			System.out.println("store in a cool dry place");
			}
		}
class Syrup extends MedicineInfo 
{
	public void displayLabel(){
		System.out.println("Consumption as directed by thephysician");
		}
	}
class Ointment extends MedicineInfo {
	public void displayLabel(){
		System.out.println("for external use only");
		}
	}

