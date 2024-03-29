package com.aditya.heaps.problems;

import java.util.*;

public class KPrimeSmallest {
    static List<Integer> A=new ArrayList<>();
    static int B=1;
    public static void main(String[] args) {
        A= Arrays.asList(1, 3, 43, 53, 61, 67, 83, 107, 109, 139, 233, 263, 311, 419,
                457, 577, 607, 743, 787, 809, 911, 941, 991, 1009, 1087, 1091, 1093, 1153, 1171, 1201,
                1223, 1237, 1259, 1277, 1283, 1291, 1453, 1511, 1543, 1607, 1787, 1831, 1847, 1901, 1949,
                1951, 1973, 1997, 2017, 2029, 2081, 2087, 2131, 2137, 2153, 2179, 2221, 2237, 2243, 2273,
                2377, 2389, 2503, 2557, 2693, 2713, 2833, 2953, 2957, 2999, 3049, 3067, 3251, 3259, 3329, 3433,
                3449, 3463, 3467, 3643, 3673, 3739, 3767, 3907, 3931, 4093, 4129, 4159, 4253, 4259, 4339, 4567,
                4663, 4759, 4973, 5039, 5081, 5227, 5231, 5297, 5347, 5399, 5413, 5417, 5483, 5503, 5623, 5641,
                5669, 5743, 5749, 5849, 5897, 5939, 6043, 6053, 6299, 6551, 6577, 6661, 6907, 6977, 7237, 7283,
                7331, 7393, 7481, 7507, 7559, 7639, 7669, 7691, 7829, 7879, 7883, 7993, 8053, 8059, 8167, 8171,
                8419, 8423, 8501, 8563, 8597, 8629, 8669, 8689, 8699, 8719, 8747, 8941, 8971, 8999, 9013, 9041,
                9059, 9067, 9109, 9161, 9209, 9227, 9371, 9377, 9467, 9479, 9539, 9551, 9619, 9649, 9721, 9769,
                9817, 9833, 9901, 9941, 9949, 10037, 10079, 10099, 10247, 10289, 10301, 10433, 10453, 10499, 10529,
                10601, 10687, 10739, 10831, 10861, 10987, 10993, 11027, 11083, 11087, 11171, 11173, 11243, 11279, 11321,
                11351, 11423, 11527, 11551, 11579, 11593, 11633, 11717, 11779, 11813, 11969, 11981, 12113, 12203, 12239,
                12251, 12269, 12329, 12457, 12553, 12611, 12671, 12697, 12899, 12919, 13001, 13063, 13171, 13241, 13291,
                13331, 13337, 13411, 13441, 13451, 13523, 13591, 13691, 13693, 13709, 13721, 13913, 14051, 14057, 14071,
                14149, 14243, 14323, 14419, 14551, 14563, 14633, 14699, 14737, 14779, 14831, 14891, 14929, 14957, 15077,
                15107, 15187, 15199, 15227, 15277, 15313, 15331, 15373, 15413, 15581, 15583, 15731, 15733, 15767, 15973,
                16061, 16073, 16097, 16229, 16249, 16273, 16333, 16349, 16381, 16453, 16487, 16553, 16619, 16693, 16831,
                16871, 16931, 17033, 17047, 17137, 17239, 17333, 17383, 17467, 17497, 17519, 17569, 17581, 17599, 17747,
                17837, 17863, 17921, 17957, 18043, 18047, 18049, 18121, 18217, 18251, 18311, 18313, 18353, 18367, 18397,
                18413, 18451, 18461, 18539, 18553, 18593, 18661, 18691, 18973, 19051, 19163, 19237, 19301, 19319, 19333,
                19421, 19423, 19433, 19469, 19477, 19559, 19763, 19819, 19891, 19949, 19961, 20047, 20051, 20101, 20117, 20147, 20201, 20231, 20327, 20407, 20533, 20549, 20599, 20627, 20681, 20707, 20731, 20963, 20983, 21013, 21121, 21143, 21323, 21391, 21467, 21499, 21521, 21529, 21649, 21767, 21821, 21851, 21929, 21937, 22123, 22259, 22303, 22409,
                22469, 22501, 22567, 22637, 22669, 22699, 22717, 22777, 23027, 23173, 23279, 23311, 23357, 23371, 23557, 23599, 23627, 23689, 23753, 23773, 23789, 23827, 23831, 23873, 23887, 23993, 24181, 24203, 24337, 24379, 24391, 24593, 24659, 24733, 24859, 24971, 25031, 25121, 25183, 25247, 25357, 25583, 25601, 25673, 25717, 25759, 25771, 25793, 25873, 25913,
                25919, 25933, 26041, 26099, 26119, 26161, 26347, 26407, 26431, 26683, 26687, 26711, 26723, 26729, 26777, 26783, 26863, 26921, 26981, 26993, 27073, 27109, 27197, 27253, 27271, 27653, 27691, 27737, 27779, 27817, 27827, 27919, 27941, 27983, 28001, 28027, 28051, 28081, 28087, 28181, 28201, 28229, 28429, 28463, 28537, 28661, 28703, 28753, 28933, 29027, 29129,
                29179, 29209, 29269, 29311, 29383, 29437, 29473, 29501, 29581, 29789, 29803, 29879, 29921, 29927 );


       for(Integer ele:solve())
           System.out.println(ele+" ");

    }
        public static ArrayList<Integer> solve() {

            PriorityQueue<Pair> queue = new PriorityQueue<>((a, b) -> Double.compare(a.divide , b.divide));
            ArrayList<Integer> ans=new ArrayList<Integer>();
            ArrayList<Pair> sorted=new ArrayList<Pair>();

            for(int i=0;i<A.size()-1;i++)
            {
                for(int j=i+1;j<A.size();j++)
                {
                    queue.offer(new Pair(A.get(i),A.get(j),A.get(i)/A.get(j)));
                }
            }
            int counter=0;
            boolean flag=true;
            while(counter<B-1)
            {
                Pair temp=queue.poll();
                counter++;
            }
            Pair pair=queue.poll();
            ans.add((int)pair.p);
            ans.add((int)pair.q);

            return ans;
        }
    }
    class Custom implements Comparator<Pair>
    {
        @Override
        public int compare(Pair p1,Pair p2)
        {
            return (int)(p1.divide-p2.divide);
        }
    }
    class Pair{
        int p;
        int q;
        double divide;
        public Pair(int p,int q,double divide)
        {
            this.p=p;
            this.q=q;
            this.divide=divide;
        }
    }


