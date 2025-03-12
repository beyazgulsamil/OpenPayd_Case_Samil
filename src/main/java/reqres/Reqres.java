package reqres;

import api_assured.*;
import models.*;
import okhttp3.Headers;
import retrofit2.Call;
import retrofit2.Response;

public class Reqres extends ApiUtilities {

    static ReqresServices reqresServices = new ServiceGenerator(
            new Headers.Builder()
                    .add("Accept", "*/*").build()
    ).setRequestLogging(true).generate(ReqresServices.class);


    public CreateUserResponseModel createUser(CreateUserRequestModel createUserRequestModel) {
        log.info("Creating user..." );
        Call<CreateUserResponseModel> createUserCall = reqresServices.createUser(createUserRequestModel);
        return perform(createUserCall, true, true);
    }

    public Response<CreateUserResponseModel> createDelayedUser(CreateUserRequestModel createUserRequestModel, String delay) {
        log.info("Creating delayed user..." );
        Call<CreateUserResponseModel> createUserCall = reqresServices.createDelayedUser(createUserRequestModel, delay);
        return getResponse(createUserCall, true, true);
    }

    public UpdateUserResponseModel updateUser(UpdateUserRequestModel updateUserRequestModel) {
        log.info("Updating user..." );
        Call<UpdateUserResponseModel> updateUserResponseModelCall = reqresServices.updateUser(updateUserRequestModel);
        return perform(updateUserResponseModelCall, true, true);
    }

    public Void deleteUser(String id) {
        log.info("Deleting user..." );
        Call<Void> deleteUserCall = reqresServices.deleteUser(id);
        return perform(deleteUserCall, true, true);
    }

}
