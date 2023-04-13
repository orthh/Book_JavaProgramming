package chap04_콘서트예약시스템;

public class SeatTable {
	private Seat[] s;
	private Seat[] a;
	private Seat[] b;
	
	public SeatTable(int s, int a, int b) {
		this.s = new Seat[s];
		this.a = new Seat[a];
		this.b = new Seat[b];
		for(int i=0; i<this.s.length; i++) {
			this.s[i] = new Seat();
		}
		for(int i=0; i<this.s.length; i++) {
			this.a[i] = new Seat();
		}
		for(int i=0; i<this.s.length; i++) {
			this.b[i] = new Seat();
		}
	}
	
	public void setSeatTable(String tableName, String name, int tableNumber) {
		if(tableName.equals("s")) {
			s[tableNumber - 1].setStatus(name);
		}else if(tableName.equals("a")) {
			a[tableNumber - 1].setStatus(name);
		}else if(tableName.equals("b")) {
			b[tableNumber - 1].setStatus(name);
		}
	}
	
	public int findIndex(Seat[] table, String name) {
		int result = -1;
		for(int i=0; i<table.length; i++) {
			System.out.println((table[i].getStatus()).equals(name));
			if(table[i].getStatus().equals(name)) {
				result = i;
				return result;
			}
		}
		return result;
	}
	
	public String calcelSeatTable(String tableName, String name) {
		
		String temp = "";
		if(tableName.equals("s")) {
			if(findIndex(s, name) == -1) {
				temp += "조회된 이름이 없습니다.";
			}else {
				s[findIndex(s,name)].setStatus(null);
				temp += "취소 완료";
			}
		}else if(tableName.equals("a")) {
			if(findIndex(a, name) == -1) {
				temp += "조회된 이름이 없습니다.";
			}else {
				a[findIndex(a,name)].setStatus(null);
				temp += "취소 완료";
			}
			
		}else if(tableName.equals("b")) {
			if(findIndex(b, name) == -1) {
				temp += "조회된 이름이 없습니다.";
			}else {
				b[findIndex(b,name)].setStatus(null);
				temp += "취소 완료";
			}
			
		}
		return temp;
	}
	
	
	public String getSeatTable(String tableName){
		String temp = tableName + ">> ";
		if(tableName.equals("s")) {
			for(Seat item: s) {
				temp += item.getStatus() + " ";
			}
		}else if(tableName.equals("a")) {
			for(Seat item: a) {
				temp += item.getStatus() + " ";
			}
		}else if(tableName.equals("b")) {
			for(Seat item: b) {
				temp += item.getStatus() + " ";
			}
		}
		
		return temp;
	}
	
	
}
