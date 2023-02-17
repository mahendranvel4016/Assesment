package mahi.mahendran;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;

	@Entity
	@Table(name="employee")
	public class employee {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String name;
		public employee(int id, String name,department dept) {
			super();
			this.id = id;
			this.name = name;
			this.dept=dept;
		}
		@ManyToOne
		@JoinColumn(name="cart_id")
		private department dept;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public department getDept() {
			return dept;
		}
		public void setDept(department dept) {
			this.dept = dept;
		}
	}

