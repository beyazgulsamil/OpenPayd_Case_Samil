package reqres;
import models.*;
import retrofit2.Call;
import retrofit2.http.*;
import static reqres.ReqresAPI.*;

public interface ReqresServices {

    String BASE_URL = ReqresAPI.BASE_URL;

    @POST(API_SUFFIX + USERS_SUFFIX)
    Call<CreateUserResponseModel> createUser(
            @Body CreateUserRequestModel createUserRequestModel
    );

    @POST(API_SUFFIX + USERS_SUFFIX)
    Call<CreateUserResponseModel> createDelayedUser(
            @Body CreateUserRequestModel createUserRequestModel,
            @Query("delay") String delay
    );

    @PUT(API_SUFFIX + USERS_SUFFIX)
    Call<UpdateUserResponseModel> updateUser(
            @Body UpdateUserRequestModel updateUserRequestModel
    );

    @DELETE(API_SUFFIX + USERS_SUFFIX + ID_SUFFIX)
    Call<Void> deleteUser(
            @Path("id") String id
    );

}
