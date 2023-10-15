package comstrategy.exemplestrategy.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Api("Desictipon strategy")
public interface StrategyService {
        @ApiResponses({
                @ApiResponse(code = 200,message = "Ok"),
                @ApiResponse(code = 404,message = "Error")
        })
        @ApiOperation("Servicio con enum")
        @GetMapping(value = "/desition", produces = APPLICATION_JSON_VALUE)
        ResponseEntity<String> saludos();
}
