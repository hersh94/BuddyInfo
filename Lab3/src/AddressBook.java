import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<BuddyInfo> buddyInfo;
	
	public AddressBook(){
		this.buddyInfo = new ArrayList<BuddyInfo>();
	}
	
	public static void main(String arg[]){
		BuddyInfo bud1 = new BuddyInfo("Josh");
		AddressBook addressBook = new AddressBook();
		System.out.println("Address Book");
		addressBook.addBuddy(bud1);
		addressBook.removeBuddy(0);
	}
	
	public void addBuddy(BuddyInfo aBuddyInfo){
		if (aBuddyInfo != null){
			this.buddyInfo.add(aBuddyInfo);
		}
	}
	
	public BuddyInfo removeBuddy(int index){
		if (index >= 0 && index < this.buddyInfo.size()){
			return this.buddyInfo.remove(index);
		}
		return null;
	}
}

