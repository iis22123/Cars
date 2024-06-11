package Cars;

import java.util.ArrayList;
import java.util.Scanner;

public class SafeCar {

	public static void main(String[] args) {

		// δημιουργία αντικειμένου scanner για να διαβάζει την καταχώρηση του χρήστη
		Scanner sc = new Scanner(System.in);
		
		String name, lastName, diefthinsi, arithmos_diplomatos, marka, modelo, year, pinakida,arithmos_plaisiou, cost;
		
		boolean done = false;
		
		// δημιουργία λίστας αντικειμένων
		ArrayList<Customer> customers = new ArrayList<Customer>();
		ArrayList<Car> cars = new ArrayList<Car>();
		ArrayList<Insurance> insurances = new ArrayList<Insurance>();
		ArrayList<Contract> contracts = new ArrayList<Contract>();
		
		// καταχώρηση πελατών με δημιουργία αντικειμένων Customer
		Customer cu;
		cu = new Customer ("Maria","Papadopoulou","Abc 1","AO79432");	
		customers.add(cu);
		cu = new Customer ("Evanthia","Evanthia","Def 1","AB55463");	
		customers.add(cu);
		cu = new Customer ("Vasilis","Karagiannis","Ghi 1","XZ69128");	
		customers.add(cu);
		
		// καταχώρηση αυτοκινήτων με δημιουργία αντικειμένων Car
		Car ca;
		ca = new Car("Mercedes","GLC","XKP8923","2020","7C3FR76A515072256");
		cars.add(ca);
		ca = new Car("Subaru","Forester","NII4269","2018","7C3FR76A555071465");
		cars.add(ca);
		ca = new Car("Ford","Ranger","KOH4681","2022","7C3FR76A5550464");
		cars.add(ca);
		
		// καταχώρηση ασφαλιστικών πακέτων με δημιουργία αντικειμένων Insurance
		Insurance in;
		in = new Insurance("ΜI93","Μικτή Ασφάλιση","6");
		insurances.add(in);
		in = new Insurance("B56","Βασική Ασφάλιση","6");
		insurances.add(in);
		in = new Insurance("O58","Με Οδική","6");
		insurances.add(in);

		// καταχώρηση συμβολαίων με δημιουργία αντικειμένων Contract
		Contract co;
		co = new Contract ("60", customers.get(0), cars.get(0), insurances.get(1));
		contracts.add(co);
		co = new Contract ("120", customers.get(1), cars.get(1), insurances.get(0));
		contracts.add(co);
		co = new Contract ("80", customers.get(2), cars.get(2), insurances.get(2));
		contracts.add(co);

		// δημιουργία μεταβλητών a, b, c, d οι οποίες θα αποθηκεύουν την επιλογή του χρήστη
		int a=0, b=0, c=0, d=0;
		
		// οσο ο χρήστης δεν επιλέγει το 3, εκτελείται το πρόγραμα
		while (b!=3) {	
			
			// οσο ο χρήστης επιλέγει μη έγκυρο αριθμό, το πρόγραμμα ζητάει ξανά καταχώρηση
			do {
				
					// εμφάνιση επιλογών
					System.out.println("1. Επιθυμώ να δω τις καταχωρήσεις");
					System.out.println("2. Επιθυμώ να πραγματοποιήσω νέα καταχώρηση");	
					System.out.println("3. Τέλος προγράμματος");
					
					// εισαγωγή επιλογής από το χρήστη
					b = sc.nextInt();
					sc.nextLine();
					
					// εάν ο χρήστης επιλέξει μη έγκυρο αριθμό, το πρόγραμμα ζητάει ξανά καταχώρηση
					if (b < 1 || b > 3) System.out.print("Μη έγκυρη απάντηση. ");
				 
					// ο χρήστης επιλέγει να δει τις καταχωρήσεις
					if (b==1) {
						
						// οσο ο χρήστης επιλέγει μη έγκυρο αριθμό, το πρόγραμμα ζητάει ξανά καταχώρηση
						do {
							
							// εμφάνιση επιλογών
							System.out.println("1. Προβολή συμβολαίων");
							System.out.println("2. Προβολή πελατών");
							
							d = sc.nextInt();
							sc.nextLine();
						
							// εάν ο χρήστης επιλέξει μη έγκυρο αριθμό, το πρόγραμμα ζητάει ξανά καταχώρηση
							if (d < 1 || d > 2) System.out.print("Μη έγκυρη απάντηση. ");
							
						} while (d < 1 || d > 2);
						
						// εμφάνιση των ήδη υπαρχουσών καταχωρήσεων (λίστα contracts με αντικείμενα Contract)
						for (Contract z: contracts){
							
							if (d==1) z.getCus().printData(z.getCar(), z);
							else z.printData(z.getCus(), z.getIns());
						
						}
						
					}
				
					// ο χρήστης επιλέγει να πραγματοποιήσει νεα καταχώρηση
					else if (b==2) {
						
						
						// εάν ο χρήστης επιλέξει μη έγκυρο αριθμό, το πρόγραμμα ζητάει ξανά καταχώρηση
						while (a != 2) { 	
							
							// εμφάνιση επιλογών
							System.out.println("Παρακαλώ καταχωρήστε όνομα");
							name = sc.nextLine();
							System.out.println("Παρακαλώ καταχωρήστε επώνυμο");
							lastName = sc.nextLine();
							System.out.println("Παρακαλώ καταχωρήστε διέθυνση");
							diefthinsi = sc.nextLine();
							System.out.println("Παρακαλώ καταχωρήστε αριθμό διπλώματος");
							arithmos_diplomatos = sc.nextLine();
							
							// έλεγχος αν υπάρχει ήδη η καταχώρηση
							for (Customer z: customers)
								if (z.getArithmos_diplomatos().equals(arithmos_diplomatos)) done = true;
								
							// αν δεν υπάρχει καταχωρεί τα δεδομένα και ζητάει πληροφορίες οχήματος
							if (!done) {
								
									cu = new Customer(name, lastName, diefthinsi, arithmos_diplomatos);
									customers.add(cu);
									System.out.println("Καταχωρήθηκε επιτυχώς");
									System.out.println("Παρακαλώ καταχωρήστε μάρκα");
									marka = sc.nextLine();
									System.out.println("Παρακαλώ καταχωρήστε μοντέλο");
									modelo = sc.nextLine();
									System.out.println("Παρακαλώ καταχωρήστε πινακίδα");
									pinakida = sc.nextLine();
									System.out.println("Παρακαλώ καταχωρήστε έτος");
									year = sc.nextLine();
									System.out.println("Παρακαλώ καταχωρήστε αριθμό πλαισίου");
									arithmos_plaisiou = sc.nextLine();
									
									// έλεγχος αν υπάρχει ήδη η καταχώρηση
									for (Car z: cars)
										if (z.getArithmos_plaisiou().equals(arithmos_plaisiou)) done = true;
										
									// αν δεν υπάρχει καταχωρεί τα δεδομένα και ζητάει πακέτο ασφάλισης
									if (!done) {
										
										ca = new Car (marka, modelo, pinakida, year, arithmos_plaisiou);
										cars.add(ca);
										System.out.println("Καταχωρήθηκε επιτυχώς");
										System.out.println("Παρακαλώ επιλέξτε πακέτο ασφάλισης:");
										
										// εάν ο χρήστης επιλέξει μη έγκυρο αριθμό, το πρόγραμμα ζητάει ξανά καταχώρηση
										do {
											
											for (int i=0; i< insurances.size(); i++)
												System.out.println(i+1 +" Κωδικός πακέτου: "+ insurances.get(i).getKodikos_paketou() +" Περιγραφή: " + insurances.get(i).getPerigrafi() + 
														" Διάρκεια: "+ insurances.get(i).getDiarkeia());
											
											c = sc.nextInt();
											sc.nextLine();
											
											if (c < 1 || c > 3) System.out.print("Μη έγκυρη απάντηση. ");
											
										} while (c < 1 || c > 3);
										
										// υπολογισμός κόστους για κάθε πακέτο
										if (c == 1) cost = "120";
										else if (c==2) cost = "60";
										else cost = "80";
										
										// καταχώρηση του συμβολαίου
										co = new Contract (cost, customers.get(customers.size()-1), cars.get(cars.size()-1), insurances.get(insurances.size()-1));
										contracts.add(co);
										
									} else System.out.println("Ο αριθμός πλαισίου που καταχωρήσατε υπάρχει");			
									
								} else System.out.println("Ο αριθμός διπλώματος που καταχωρήσατε υπάρχει");
								
							// εάν ο χρήστης επιλέξει μη έγκυρο αριθμό, το πρόγραμμα ζητάει ξανά καταχώρηση
							do {
								
								// ο χρήστης επιλέγει αν επιθυμεί να προχωρήσει σε νέα καταχώρηση
								System.out.println("Επιθυμείτε να καταχωρήσετε άλλο όνομα;");
								System.out.println("1. Ναι");
								System.out.println("2. Όχι");
								
								a = sc.nextInt();
								sc.nextLine();
								
								if (a < 1 || a > 2) System.out.print("Μη έγκυρη απάντηση. ");
								
							} while (a < 1 || a > 2);
					}
					
				}
					
			} while (b < 1 || b > 3);
	
		}
	}

}
