package uz.exemple.less8_task5_java.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import uz.exemple.less8_task5_java.R;
import uz.exemple.less8_task5_java.models.PostModel;

public class PostAdapter  extends RecyclerView.Adapter<PostAdapter.ViewHolder>{

    ArrayList<PostModel> arrayList;


    public PostAdapter(ArrayList<PostModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post,parent,false);
        return new PostAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolder holder, int position) {
        holder.textView.setText("Title: "+ arrayList.get(position).getTitle());
        holder.imageView.setImageResource(arrayList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        LinearLayout linearLayout;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.linear_layout);
            textView = itemView.findViewById(R.id.itemTv);
            imageView = itemView.findViewById(R.id.image_view);
        }
    }
}
