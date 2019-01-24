package org.company;

public class CompanyInfo {
public void companyName() {
	System.out.println("HCL");
}
public void companyId() {
	System.out.println("51610229");
}
public void companyAddress() {
System.out.println("GreamsRoad");
}
public static void main(String[] args) {
	CompanyInfo co=new CompanyInfo();
co.companyId();
co.companyAddress();
co.companyName();
}
}
