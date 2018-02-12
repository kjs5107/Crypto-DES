/**
Includes encryption and decryption algirithms
Author: Kyle Scagnelli
*/

class DES{
   /**
    DES encryption algorithm 
    @param x 64-bit plaintext
    @param key 64-bit key
    @return 64-bit encrypted text   
   */   
   static String encrypt(String x, String key){
      String[] subkeys = KeySchedule.generateSubkeysForEncryption(key);
      String initialPermutedOutput = IP.permute(x); 
      String FeistelOutput = FeistelNetwork.iterate(initialPermutedOutput,subkeys);
      String finalOutput = IPinverse.permute(FeistelOutput);
      return finalOutput;
   }
   /**
    DES decryption algorithm
    @param y 64-bit ciphertext
    @param key 64-bit key
    @return 64-bit decrypted text  
   */
   static String decrypt(String y, String key){
      String[] subkeys = KeySchedule.generateSubkeysForDecryption(key);
      String initialPermutedOutput = IP.permute(y); 
      String FeistelOutput = FeistelNetwork.iterate(initialPermutedOutput, subkeys);
      String finalOutput = IPinverse.permute(FeistelOutput);
      return finalOutput;
   }
   
}