import com.app.ItemService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ItemServiceTest {

    ItemService itemService = new ItemService();
    @Test
    public void check_if_order_amount_is_correct_on_adding_items_to_cart() {

        itemService.addItem("Sweet corn soup", 119);
        itemService.addItem("Vegetable lasagne", 269);

        List<String> itemsList = new ArrayList<>();
        itemsList.add("Sweet corn soup");
        itemsList.add("Vegetable lasagne");
        Integer total = itemService.getTotalOrderAmount(itemsList);
        Assertions.assertEquals(388, total);
    }

}
