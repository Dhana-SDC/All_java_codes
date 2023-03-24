package Task;

public class Author {
		
		private String name;
		private String email;
		private char gender;
		
		public void  Author1(String name, String email, char gender) {
	
			this.name = name;
			this.email = email;
			this.gender = gender;
		}

		public String getName() {
			System.out.println(name);
			return name;
		}

		public String getEmail() {
			System.out.println(email);
			return email;
		}

		public char getGender() {
			System.out.println(gender);
			return gender;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String toString() {
			return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
		}
	public static void main(String[]args) {
		Author aut=new Author();
		aut.Author1("SDC", "rocks@gmail.com", 'M');
		aut.getName();
		aut.getEmail();
		aut.getGender();
		aut.setEmail("rocks@gmail.com");
		book Book= new book();
		Book.Book2("nature",aut,1500,15);
		Book.getName();
		Book.getAuthor();
		Book.setPrice(1500);
		Book.setQty(15);
		Book.toString();
		
	}
}

	 class book {
			private String name;
			private Author author;
			private double price;
			private int qty;
			
			public void Book2(String name, Author author, double price,int qty) {
			
				this.name = name;
				this.author = author;
				this.price = price;
				this.qty = qty;
		}

		public String getName() {
			System.out.println(name);
			return name;
		}

		public Author getAuthor() {
			System.out.println(author);
			return author;
		}

		public double getPrice() {
			System.out.println(price);
			return price;
		}

		public int getQty() {
			System.out.println(qty);
			return qty;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public void setQty(int qty) {
			this.qty = qty;
		}
	 

		
		public String toString() {
			System.out.println("Book [name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + "]");
		return name;
		}
		
	}
	


