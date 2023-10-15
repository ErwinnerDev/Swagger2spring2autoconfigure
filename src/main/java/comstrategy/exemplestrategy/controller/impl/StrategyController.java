package comstrategy.exemplestrategy.controller.impl;

import comstrategy.exemplestrategy.controller.StrategyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StrategyController implements StrategyService {
    @Override
    public ResponseEntity<String> saludos() {
        return new ResponseEntity<>("Hola", HttpStatus.OK);
    }
}
