package ohohbooking_gon;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookingListRepository extends CrudRepository<BookingList, Long> {

    List<BookingList> findByBookingId(Long bookingId);
    List<BookingList> findByBookingId(Long bookingId);

        void deleteByBookingId(Long bookingId);
}