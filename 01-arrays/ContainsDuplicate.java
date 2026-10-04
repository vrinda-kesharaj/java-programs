public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    return true ;
                }
            }
        }
        return false ;

    }

    public static void main(String args[])
    {
        int[] t1={1,2,3,1};
        int[] t2={1,2,3,4};
        System.out.println(containsDuplicate(t1));
        System.out.println(containsDuplicate(t2));
    }
}