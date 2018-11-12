package online_booking.bl.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface RestaurantMapper {

    /**
     * get r list
     *
     * @param map
     * @return
     */
    List<Map<String, Object>> list(Map<String, Object> map);

    /**
     * getr
     *
     * @param map
     * @return
     */
    Map<String, Object> show(Map<String, Object> map);

    /**
     * add r
     *
     * @param map
     * @return
     */
    int add(Map<String, Object> map);

    /**
     * r list
     *
     * @param restaurants_id
     * @return
     */
    List<Map<String, Object>> dishsList(int restaurants_id);


    /**
     * add list
     *
     * @param map
     * @return
     */
    int dishsAdd(Map<String, Object> map);

    /**
     * seat list
     *
     * @param restaurants_id
     * @return
     */
    List<Map<String, Object>> seatList(int restaurants_id);


    /**
     * add list
     *
     * @param map
     * @return
     */
    int seatAdd(Map<String, Object> map);

    /**
     * get seat number
     *
     * @return
     */
    int bookingCount(Map<String, Object> map);

    /**
     * get r type
     *
     * @return
     */
    List<String> types();
}
