import java.io.File;
import java.io.IOException;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.similarity.ItemSimilarity;


public class Evaluator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DataModel model=new FileDataModel(new File("D:\\Tools\\Word Materials\\Recommender\\intro.csv"));
		
		RecommenderBuilder builder=new RecommenderBuilder(){

			@Override
			public Recommender buildRecommender(DataModel model)
					throws TasteException {
				// TODO Auto-generated method stub
				ItemSimilarity similarity =new PearsonCorrelationSimilarity(model);
				
				return new GenericItemBasedRecommender(model,similarity);
			}
			
		};
		
		RecommenderEvaluator evaluator=new AverageAbsoluteDifferenceRecommenderEvaluator();
		double score=evaluator.evaluate(builder, null, model,0.7,1.0);
		System.out.println(score);
	}

}
