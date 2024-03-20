package pgdp.arrays;

public class Genome {
    static int LENGTH = 13;
    static String dna ="TTTTCTTTTAATT";


    public static int interpretGene(String gene){
        int result = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(gene);
        int []letter = new int[gene.length()];
        for (int i = 0; i < gene.length(); i++) {
            if (sb.charAt(i) == 'A'){
                letter[i] = 0;
            }else if (sb.charAt(i) == 'C'){
                letter[i] = 1;
            }else if (sb.charAt(i) == 'G'){
                letter[i] = 2;
            }else if (sb.charAt(i) == 'T'){
                letter[i] = 3;
            }
        }
        int j = gene.length()-1;
        for (int i = 0; i < gene.length(); i++) {
            result = result + (letter[i] * ((int) Math.pow(4,j)));
            j--;
        }
        return result;
    }


    public static void main(String[] args){
        System.out.println(interpretGene("AAC"));
    }

}
