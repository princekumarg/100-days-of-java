package queue;
//pertrol[]={4,8,7,4},dist[]={6,5,3,5}==6-4==2o/p
public class circularTour {
    public static int petrodist(int petrol[],int dist[],int n){
        for(int i=0;i<n;i++){
            int curr_pertrol=0;
            int end=i;
            while(true){
                curr_pertrol=curr_pertrol+(petrol[end]-dist[end]);
                if(curr_pertrol<0){
                    break;
                }
                end=(end+1)%n;
                if(end==i){
                    return (i+1);
                }
            }
        }
        return -1;
    }
    public static int firstpetrolpump(int petrol[],int dist[],int n){
        int start=0,curr_pet=0;
        int prev_pet=0;
        for(int i=0;i<n;i++){
            curr_pet+=(petrol[i]-dist[i]);
            if(curr_pet<0){
                start=i=1;
                prev_pet+=curr_pet;
                curr_pet=0;
            }
        }
        return ((curr_pet+prev_pet>=0)?(start+1):-1);
    } 
}
