import models.TableModel;
import presenters.BookingPresenter;
import presenters.Model;
import presenters.View;
import views.BookingView;

import java.util.Date;

public class Main {

    /**
     * TODO: ДОМАШНЕЕ ЗАДАНИЕ: Метод changeReservationTable ДОЛЖЕН ЗАРАБОТАТЬ!
     * @param args
     */
    public static void main(String[] args) {

        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);

        System.out.println("=============== Изначальный пул резервов ==========");
        presenter.updateUIShowTables();
        System.out.println("=============== Пользователь создал резерв =============== ");
        view.reservationTable(new Date(), 2, "Станислав");
        presenter.updateUIShowTables();
        System.out.println("=============== Пользователь изменил резерв =============== ");
        view.changeReservationTable(1001, new Date(), 3, "Вечеслав");
        presenter.updateUIShowTables();
    }

}
