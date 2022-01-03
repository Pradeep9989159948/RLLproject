package com.java.jdbc;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;



public class CanteenMain {
	static Scanner sc = new Scanner(System.in);
	
	public static void showResturant() throws ClassNotFoundException, SQLException {
		try {
		ResturantDAO dao = new ResturantDAO();
		List<Resturant> resturantList = dao.showResturant();
		for (Resturant resturant : resturantList) {
			System.out.println(resturant);
		}
		}catch(ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
						e.printStackTrace();
			
		}
	}
	public static void searchResturant() throws ClassNotFoundException, SQLException {
		int resturantid;
		System.out.println("Enter ressturantid   ");
		resturantid = sc.nextInt();
	    ResturantDAO dao = new ResturantDAO();
	    Resturant resturant = dao.searchResturant(resturantid);
	   
		if (resturant!=null) {
			System.out.println(resturant);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	    
	    	
	    }
	public static void showVendor() throws ClassNotFoundException, SQLException {
		try {
			VendorDAO dao = new VendorDAO();
		List<Vendor> vendorList = dao.showVendor();
		for (Vendor vendor : vendorList) {
			System.out.println(vendor);
		}
		}catch(ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
						e.printStackTrace();
			
		}
	}
	public static void searchVendor() throws ClassNotFoundException, SQLException {
		int vendorid;
		System.out.println("Enter vendorid   ");
		vendorid = sc.nextInt();
		VendorDAO dao = new VendorDAO();
		Vendor vendor = dao.searchvendor(vendorid);
	   
		if (vendor!=null) {
			System.out.println(vendor);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	    
	    	
	    }
	public static void showWallet() throws ClassNotFoundException, SQLException {
		try {
			WalletDAO dao = new WalletDAO();
		List<Wallet> walletList = dao.showWallet();
		for (Wallet wallet : walletList) {
			System.out.println(wallet);
		}
		}catch(ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
						e.printStackTrace();
			
		}
	}
	public static void searchWallet() throws ClassNotFoundException, SQLException {
		int walletid;
		System.out.println("Enter walletid   ");
		walletid = sc.nextInt();
		WalletDAO dao = new WalletDAO();
		Wallet wallet = dao.searchWallet(walletid);
	   
		if (wallet!=null) {
			System.out.println(wallet);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	    
	    	
	    }
	public static void showCustomer1() throws ClassNotFoundException, SQLException {
		try {
			Customer1DAO dao = new Customer1DAO();
		List<Customer1> customer1List = dao.showCustomer1();
		for (Customer1 customer1 : customer1List) {
			System.out.println(customer1);
		}
		}catch(ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
						e.printStackTrace();
			
		}
	}
	public static void searchCustomer1() throws ClassNotFoundException, SQLException {
		int customerid;
		System.out.println("Enter customerid   ");
		customerid = sc.nextInt();
		Customer1DAO dao = new Customer1DAO();
		Customer1 customer1 = dao.searchcustomer1(customerid);
	   
		if (customer1!=null) {
			System.out.println(customer1);
		} else {
			System.out.println("*** Record Not Found ***");
		}
	    
	    	
	    }
	
	public static void showMenu() throws ClassNotFoundException, SQLException {
		int resturantid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ressturantid   ");
		resturantid = sc.nextInt();
		MenuDAO dao = new MenuDAO();
		
			List<Menu> menuList = dao.showMenu(resturantid);
			if(menuList!=null) {
				for (Menu menu : menuList) {
					System.out.println(menu);
				}
		  }else {
			  System.out.println("***********record not found*********");
		  }
		
		
		
	}
	public static void showMenuById() throws ClassNotFoundException, SQLException {
		int menuid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter menuid   ");
		menuid = sc.nextInt();
		MenuDAO dao = new MenuDAO();
		
			Menu menu = dao.showMenuById(menuid);
			if (menu!=null) {
				System.out.println(menu);
			} else {
				System.out.println("*** Record Not Found ***");
			}
		
	}
	

	/*
	 * DAO to be be called in MAIN
	 * Menu as 
	 * 1) Show Restaurant
	 * 2) Search By Restaurant Id
	 * 3) Show Menu
	 * 4) Search Menu 
	 */
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S");
			System.out.println("---------------");
			System.out.println("1. Show Restaurant list ");
			System.out.println("2. Search Restaurant");
			System.out.println("3. show menu by resturantid");
			System.out.println("4. show menu by menuid");
			System.out.println("5. show customer list");
			System.out.println("6. show customer by id");
			System.out.println("7. show vendor list");
			System.out.println("8. show vendor by id");
			System.out.println("9. show wallet list");
			System.out.println("10. show wallet by id");
			System.out.println("11.  exit");
			System.out.println("Enter Your Choice   ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				try {
					showResturant();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 2 : 
				try {
					searchResturant();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				
				try {
					showMenu() ;
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				try {
					showMenuById();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5:
				try {
					showCustomer1();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 6:
				try {
					searchCustomer1();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 7:
				try {
					showVendor();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 8:
				try {
					searchVendor();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}break;
			case 9:
				try {
					showWallet();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			case 10:
				try {
					searchWallet();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				
			    
			case 11 : 
				return;
			}
		} while(choice!=11);
	}
}
