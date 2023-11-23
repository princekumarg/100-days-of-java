package Recursion;

import java.util.*;

public class Tower_of_hanoie {
    public static void TOH(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Move 1 From " + a + " to " + c);
            return;
        } else {
            TOH(n - 1, a, c, b);
            System.out.println("Move " + n + " From " + a + " to " + c);
            TOH(n - 1, b, a, c);
        }
    }

    /*
     * class Solution {
     * public:
     * int calPoints(vector<string>& ops) {
     * vector<int> daal_nikal;
     * for(int i=0;i<ops.size();i++)
     * {
     * if(ops[i]=="D")
     * daal_nikal.push_back(2*daal_nikal[daal_nikal.size()-1]);
     * else if(ops[i]=="+")
     * daal_nikal.push_back(daal_nikal[daal_nikal.size()-1]+daal_nikal[daal_nikal.
     * size()-2]);
     * else if(ops[i]=="C")
     * daal_nikal.pop_back();
     * else
     * {
     * daal_nikal.push_back(stoi(ops[i]));
     * }
     * 
     * }
     * int sum=0;
     * for(int i=0;i<daal_nikal.size();i++)
     * sum+=daal_nikal[i];
     * return sum;
     * }
     * };
     */
    public static void main(String args[]) {
        int n = 2; // Number of disks
        TOH(n, 'A', 'C', 'B');
    }
}
