public class AgeOfDogs {
    public static void main(String[] args){
        int wDogAge = 3;
        int mDogAge = 7;

        boolean result1 = (wDogAge == mDogAge);
        boolean result2 = wDogAge > mDogAge;
        boolean result3 = wDogAge < mDogAge;

        System.out.println("동갑인가: " + result1);
        System.out.println("윈터가 많은가: " + result2);
        System.out.println("멕스가 많은가: " + result3);
    }
}
