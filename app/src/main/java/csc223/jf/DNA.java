package csc223.jf;
public class DNA {
    public static String countNucleotides(String dna){
        // create array
        int[] dNArray = new int[4];
        // dNArray[0] = number of A's, dNArray[1] = number of C's, dNArray[2] = number of G's, dNArray[3] = number of T's


        // loop through characters of string, at most 1000 chars
        for (int i=0;i<dna.length();i++){
            char character = dna.charAt(i);

            if (character == 'A'){
                dNArray[0]++;
            }

            else if (character == 'C'){
                dNArray[1]++;
            }

            else if (character == 'G'){
                dNArray[2]++;
            }

            else if (character == 'T'){
                dNArray[3]++;
            }
        }

        return(dNArray[0]+" "+dNArray[1]+" "+ dNArray[2]+" "+dNArray[3]);
    }
    public static String transcribe(String dna){
        // create string to replace T with U
        String dNAU = new String();
        for (int i=0;i<1000;i++){
            char character = dna.charAt(i);
            // if character = T, replace it with a U
            if (character == 'T'){
                dNAU += 'U';
            }
             else{
                dNAU += character;
             }
            
        }

        return dNAU;
    }
    public static String reverseComplement(String dna){
        // reverses original DNA string
        String reversedDNA = " ";

        for (int i = dna.length()-1; i>=0; i--){

            reversedDNA += dna.charAt(i);

        }

        String newDna = new String();

        for (int i=0;i<1000;i++){
            char character = reversedDNA.charAt(i);

            // replace reversed character with its opposite character
            if (character == 'A'){
                newDna += 'T';
            }

            else if (character == 'C'){
                newDna += 'G';
            }

            else if (character == 'G'){
                newDna += 'C';
            }

            else if (character == 'T'){
                newDna += 'A';
            }
        }
        // return new dna string
        return newDna;
    }

    public static void main(String[] args) {
        String result = DNA.countNucleotides("AACGT");
        System.out.println(result);
    }
}

