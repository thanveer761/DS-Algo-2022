package day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FlipImage {
	@Test
	public void testCase1() {
		int[] [] image= {{1,1,0},{1,0,1},{0,0,0}};
		int[][] flipImage = flipImage(image);
		System.out.println(Arrays.toString(flipImage));
//Assert.assertArrayEquals(flipImage(image), new int[][]{{1,0,0},{0,1,0},{1,1,1}});
		
	}
public int[][] flipImage(int[] [] image) {
	   
    //For Flipping
    for(int i = 0; i <= image.length - 1; i++){
    	System.out.print(i);
        for(int j = 0; j < image.length / 2; j++){
        	//System.out.print(j);
            int temp = image[i][j];
            image[i][j] = image[i][image.length -j- 1];
            image[i][image.length -j- 1] = temp;
        }
    }
    
    //For Inverting
    for(int i = 0; i < image.length; i++){
        for(int j = 0; j < image.length; j++){
            if(image[i][j] == 0){
                image[i][j] = 1;
            }else{
                image[i][j] = 0;
            }
        }
    }
    
    
    return image;
}
}
