package uz.exemple.less8_task5_java.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import uz.exemple.less8_task5_java.R;
import uz.exemple.less8_task5_java.adapters.UserAdapter;
import uz.exemple.less8_task5_java.models.UserModel;

public class UsersFragment extends Fragment {
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.user_fragment,container,false);
        initViews(view);
        return view;
    }
    void initViews(View view){
        recyclerView = view.findViewById(R.id.users_Rw_List);
        ArrayList<UserModel> arrayList = new ArrayList<UserModel>();
        for (int i=1;i<21;i++) {
            arrayList.add(new UserModel("User"+i,  17+i));
        }
        UserAdapter userAdapter = new UserAdapter(arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setAdapter(userAdapter);
    }
}
