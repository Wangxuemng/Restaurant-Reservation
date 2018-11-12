package online_booking.bl.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface ActionMapper {

    /**
     * reservation
     *
     * @param map
     * @return
     */
    int bookingSeat(Map<String, Object> map);

    /**
     * cancel reseration
     *
     * @param map
     * @return
     */
    int cancelBookingSeat(Map<String, Object> map);

    /**
     * reject reservation
     *
     * @param map
     * @return
     */
    int rejectBookingSeat(Map<String, Object> map);

    /**
     * confirm reservation
     *
     * @param map
     * @return
     */
    int confirmBookingSeat(Map<String, Object> map);

    /**
     * get all user information
     *
     * @param map
     * @return
     */
    List<Map<String, Object>> userMessages(Map<String, Object> map);

    /**
     * get all r information
     *
     * @param map
     * @return
     */
    List<Map<String, Object>> userMessages2(Map<String, Object> map);
}
