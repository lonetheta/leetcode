package Arrays;

public class Medium495 {
	public int findPoisonedDuration(int[] timeSeries, int duration) {
        int count = 0;
        for(int i=0; i<timeSeries.length-1; i++)
        {
            if(timeSeries[i]+duration <= timeSeries[i+1])
                count += duration;
            else
            {
                count += timeSeries[i+1]-timeSeries[i];
            }
        }
        if(timeSeries.length > 0)
        count += duration;
        return count;
    }
}
