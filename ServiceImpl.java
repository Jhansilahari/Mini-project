package yourcompany.MobilePurchaseSystem.service;

import java.util.List;   //importing list and scanner class
import java.util.Scanner;

import yourcompany.MobilePurchaseSystem.dao.DatabaseConnection;
import MobilePurchaseSystem.entity.Mobiles;

public class ServiceImpl {
	Scanner sc=new Scanner(System.in);
	DatabaseConnection d=new DatabaseConnection();  //declaring object of DatabaseConnection class from DAO layer
	
	public void insertCustomerAndPurchaseDetails() {
		d.insertCustomerAndPurchaseDetails();
	}
	public void deleteMobile() {
		d.deleteMobile();
	}
	public List<Mobiles> getAllMobilesDetails(){
		return d.getAllMobilesDetails();
	}
	public void updateMobileQuantity(int MobileId) {
		d.updateMobileQuantity(MobileId);
	}
	public void searchMobile() {
		d.searchMobile();	
	}
	public void addMobileDetails() {
		d.addMobileDetails();
	}
}
