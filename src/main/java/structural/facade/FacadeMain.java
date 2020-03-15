package structural.facade;

/**
 * Entry point for facade design pattern
 *
 * @author Milan Rathod
 */
public class FacadeMain {

    public static void main(String[] args) {
        HotelFacade hotelFacade = new HotelFacade();

        System.out.println(hotelFacade.getVegMenu());

        System.out.println(hotelFacade.getNonVegMenu());
    }
}
