// // EXCEPTION HANDELING 

// // Custom exception for non-members
// class NotAMemberException extends Exception {
//     public NotAMemberException(String message) {
//         super(message);
//     }
// }

// // Class representing club services
// class ClubFacility {
//     public void memberFacilities() {
//         System.out.println("Welcome to the Exclusive Member Lounge. Enjoy premium services!");
//     }
//     public void guestFacilities() {
//         System.out.println("Welcome Guest! Please enjoy our general facilities.");
//     }
// }

// public class class3 {
//     // Method checking membership and redirecting accordingly
//     public static void checkAccess(boolean isMember) throws NotAMemberException {
//         if (!isMember) {
//             throw new NotAMemberException("User is not a member, redirecting to guest facilities...");
//         }
//         // Continue normal flow for members
//         ClubFacility cf = new ClubFacility();
//         cf.memberFacilities();
//     }

//     public static void main(String[] args) {
//         ClubFacility cf = new ClubFacility();
//         boolean isMember = false;   // Change to true for member flow

//         try {
//             checkAccess(isMember);
//         } catch (NotAMemberException e) {
//             System.out.println(e.getMessage());
//             // Redirect user to guest flow
//             cf.guestFacilities();
//         }

//         System.out.println("End of club access logic.");
//     }
// }

// CLUB MEMBERSHIP MANAGEMENT 


// interface ClubRules{
//     void acceessClub();
  
// }
// // creating class for diff club memebers implementing interfaces 

// class Member implements ClubRules{
//     public void acceessClub(){
//             System.out.println(" Welcome to the Member Lounge Enjoy the Stay. ");
//     }
// }
// class VIPMember implements ClubRules{
//     public void acceessClub(){
//         System.out.println("Welcome VIP! Chapagne is on the house. ");
//     }
// }
// class Guest implements ClubRules{
//     public void acceessClub(){
//         System.out.println("You are a guest enjoy our very very limited access to our restrooms");
//     }
// }

// class UnknownUserTypeException extends Exception {
//     public UnknownUserTypeException(String message) {
//         super(message);
//     }
// }

// public class class3 {
    

//     public static void main(String[] args) {
//             String userType = "Banana";     
//           try {
//             if(userType == "Member"){
//                 Member m = new Member();
//                 m.acceessClub();
//             }
//             else if(userType == "VIPMember"){
//                  VIPMember v = new VIPMember();
//                  v.acceessClub();
//             }
//             else if(userType == "Guest"){
//                  Guest g = new Guest();
//                  g.acceessClub();
//             }
//             else{
//                 throw new UnknownUserTypeException("Invalid User type, access Denied ");
//                }
//             } catch ( UnknownUserTypeException e) {
//                 System.out.println("Invalid user type, access denied.");
//           }
//           System.out.println("--End Of Club Entry--");
//       }
//  }

