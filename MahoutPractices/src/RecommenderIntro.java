import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.*;



public class RecommenderIntro {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DataModel model=new FileDataModel(new File("D:\\Tools\\Word Materials\\Recommender\\intro.csv"));
		UserSimilarity similarity=new PearsonCorrelationSimilarity(model);
		UserNeighborhood neighorhood=new NearestNUserNeighborhood(2,similarity,model);
		Recommender recommender=new GenericUserBasedRecommender(model, neighorhood, similarity);
		List<RecommendedItem> recommendations=recommender.recommend(24,1);
		
		
		ListIterator<RecommendedItem> iterator=recommendations.listIterator();
		
		while(iterator.hasNext()){
			
			RecommendedItem item=iterator.next();
			System.out.println(item);
		}
	}

}
