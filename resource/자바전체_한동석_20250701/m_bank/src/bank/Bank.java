package bank;

public class Bank {
	private String name;
	private String account;
	private String phone;
	private String password;
	private int money;

	public Bank() {
		;
	}

	public Bank(String name, String account, String phone, String password, int money) {
		super();
		this.name = name;
		this.account = account;
		this.phone = phone;
		this.password = password;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

//	계좌번호 중복검사
	public final static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
		Bank bank = null;

		for (int i = 0; i < arrBank.length; i++) {
			int j = 0;

			for (j = 0; j < arCount[i]; j++) {
				if (arrBank[i][j].getAccount().equals(account)) {
					bank = arrBank[i][j];
					break;
				}
			}

			if (j != arCount[i]) {
				break;
			}
		}

		return bank;
	}

//	핸드폰 번호 중복검사
	public final static Bank checkPhone(Bank[][] arrBank, int[] arCount, String phone) {
		Bank bank = null;

		for (int i = 0; i < arrBank.length; i++) {
			int j = 0;

			for (j = 0; j < arCount[i]; j++) {
				if (arrBank[i][j].getPhone().equals(phone)) {
					bank = arrBank[i][j];
					break;
				}
			}

			if (j != arCount[i]) {
				break;
			}
		}

		return bank;
	}

//	로그인
	public final static Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
		Bank user = checkAccount(arrBank, arCount, account);
		if(user != null) {
			if(user.password.equals(password)) {
				return user;
			}
		}
		
		return null;
	}

//	입금
	public void deposit(int money) {
		this.money += money;
	}

//	출금
	public void withdraw(int money) {
		this.money -= money;
	}

//	잔액 조회
	public int showBalance() {
		return money;
	}

}
