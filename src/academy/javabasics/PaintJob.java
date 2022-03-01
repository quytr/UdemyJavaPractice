package academy.javabasics;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        int bucket =0;
        int finalBucket=0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            bucket = getBucketCount(width,height,areaPerBucket);
            return finalBucket = bucket - extraBuckets;
        }

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            return getBucketCount(width*height,areaPerBucket);  //area = width * height //return how many bucket for assigned area
        }

    }

    public static int getBucketCount(double area, double areaPerBucket) {

        int bucket = 0;
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            bucket = (int) Math.ceil(area / areaPerBucket);
        }
        return bucket;  //how many bucket needs to use for assigned area
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
        System.out.println("-------------------------------");
        System.out.println(getBucketCount(-3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(7.25,4.3,2.35));
        System.out.println("--------------------------------");
        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(2.75,3.25,2.5,1));


    }
}
