class Encryption extends ConsoleProgram {

  /**
  * A program the encrypts a message inputted by the user
  * @author: 
  */
  
  public void run() {
    
    
    String strMessage;
    String resulted;

    System.out.println("**** Encryption Program *****");

    strMessage = readLine("Enter the message to encrypt: ");
    int intnumber = readInt("Enter the shift amount: ");

    resulted = EncryptionMethod(strMessage, intnumber);

    System.out.println("Here is your encrypted message: " + resulted);
  }

  public String EncryptionMethod(String str, int number) {

    String result = "";

    for (int i = 0; i < str.length(); i++) {
      result += (char)(' ' + ((str.charAt(i) - ' ' + number) % 95));
    }

    return result;
  }
}
