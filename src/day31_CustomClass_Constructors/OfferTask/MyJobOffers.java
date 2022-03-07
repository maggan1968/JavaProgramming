package day31_CustomClass_Constructors.OfferTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyJobOffers {
    public static void main(String[] args) {

//1 Create 7 objects of Offer
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();


//2 Create an array of Offers named myOffers and store all 7 objects of offers
        offer1.setInfo("CA", "Amazon Inc", "SDET", 120000, true, false, false, false);
        offer2.setInfo("TX", "Samsung Inc", "Software Developer", 130000, true, true, true, false);
        offer3.setInfo("VA", "Bra Hak Inc", "QA", 110000, true, true, true, true);
        offer4.setInfo("NV", "Panasonic Inc", "Scrum Master", 1250000, false, false, true, false);
        offer5.setInfo("NC", "Uber", "SDET", 1200000, false, true, true, false);
        offer6.setInfo("WA", "Sony Inc", "BA", 1350000, true, false, true, true);
        offer7.setInfo("CO", "Subaru Inc", "QE", 85000, true, true, true, true);


        Offer[] myOffers ={offer1, offer2, offer3, offer4, offer5, offer6, offer7};

  //3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
  //3.1 Write a program that can remove the offer objects that are not full-time
        //only keep the offers that are full-time
        ArrayList<Offer> fullTimeOffers = new ArrayList<>( Arrays.asList(myOffers) );
        fullTimeOffers.removeIf( offer -> !offer.isFullTime   );

        System.out.println(fullTimeOffers.size());
        System.out.println(fullTimeOffers);

      //  4 Create an ArrayList of Offer named localOffers and add all the offer objects.
      //  2.4.1 Write a program that can remove all the offers that are not from local

        ArrayList<Offer> localOffers = new ArrayList<>( Arrays.asList(myOffers) );
        localOffers.removeIf(p-> !p.location.equals("VA") ); // removes the offer if the offer is not from local area

        System.out.println(localOffers.size());

      // 5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
        // 2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
        ArrayList<Offer> offersWithBenefits  = new ArrayList<>( Arrays.asList(myOffers) );
        offersWithBenefits.removeIf(p-> !p.hasBenefit && !p.hasPTO);

        System.out.println(localOffers.size());

    }
}
/*
 2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that are not for SDET
            2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
 */