import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Delimiters d1 = new Delimiters("(", ")");
        String[] tokens1 = {"(", "x + y", ")", " * 5"};
        ArrayList<String> delims1 = d1.getDelimitersList(tokens1);
        System.out.println(delims1); 
        System.out.println(d1.isBalanced(delims1)); 

        Delimiters d2 = new Delimiters("<q>", "</q>");
        String[] tokens2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        ArrayList<String> delims2 = d2.getDelimitersList(tokens2);
        System.out.println(delims2); 
        System.out.println(d2.isBalanced(delims2)); 

        Delimiters d3 = new Delimiters("<sup>", "</sup>");
        ArrayList<String> delims3 = new ArrayList<>();
        String[] tags = {"<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"};
        for (String t : tags) delims3.add(t);
        System.out.println(d3.isBalanced(delims3)); 

        ArrayList<String> delims4 = new ArrayList<>();
        delims4.add("<sup>");
        delims4.add("</sup>");
        delims4.add("</sup>");
        delims4.add("<sup>");
        System.out.println(d3.isBalanced(delims4)); 
    }
}