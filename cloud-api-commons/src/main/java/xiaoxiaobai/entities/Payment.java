package xiaoxiaobai.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: hys
 * @createTime: 2023年05月18日 18:12:02
 * @version: 1.0.0
 * @Description: 付款实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}