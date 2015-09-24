
public class BuddyInfo {
	private String name;

	public BuddyInfo(String name){
		this.name = name;
		
	}
	public String getName() {
		System.out.print("Teammate Changed");
		return name;
		
	}



	public static void main(String[] args) {
        BuddyInfo man = new BuddyInfo("Homer");    
		System.out.println("Hello " + man.getName());
    }
}

