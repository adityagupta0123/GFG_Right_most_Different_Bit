//static int getRightMostSetBit(int n) 
  //  {
    //    if(n == 0)
      //    return 0;
      
        //return (int)((Math.log10(n & -n)) / 
          //           Math.log10(2)) + 1;
         
    //}
    
    // Function to find the position of
    // rightmost different bit in the
    // binary representations of 'm' and 'n'
    static int posOfRightMostDiffBit(int m, int n) 
    {
        // position of rightmost different bit
       // return getRightMostSetBit(m ^ n);
        return (int)Math.floor(Math.log10(Math.pow(m ^ n,2)))+2;
    }
