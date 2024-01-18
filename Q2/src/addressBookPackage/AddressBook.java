/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressBookPackage;

/**
 *
 * @author admin
 */
public class AddressBook {
    public String Name;
    public String Address;
    public long PhoneNo;
    public String BussinessAddress;
    public long BussinessPhoneNo;
    public String FaxMachineNo;
    public long CellularPhoneNo;
    public String PagerNo;
    
    public AddressBook(String name, String address, long phoneNo, String bussinessAddress, long businessPhoneNo, String faxMachineNo, long cellularPhoneNo, String pagerNo) {
        this.Name = name;
        this.Address = address;
        this.PhoneNo = phoneNo;
        this.BussinessAddress = bussinessAddress;
        this.BussinessPhoneNo = businessPhoneNo;
        this.FaxMachineNo = faxMachineNo;
        this.CellularPhoneNo = cellularPhoneNo;
        this.PagerNo = pagerNo;
    }
    
    @Override
    public String toString() {
        return "\n=======\nName: "+this.Name+ "\nAddress: "+this.Address+"\nPhoneNo: "+this.PhoneNo+"\nBussiness Address: "+this.BussinessAddress+"\nBussiness Phone No: "+this.BussinessPhoneNo+"\nFax Machine No: "+this.FaxMachineNo+"\nCellular No: "+this.CellularPhoneNo+"\nPagerNo: "+this.PagerNo+"\n=======\n";
    }
}
