function [X_norm, mu, sigma] = featureNormalize(X)

X_norm = X;
mu = zeros(1, size(X, 2));%size of x is (X, 2)=columns
sigma = zeros(1, size(X, 2));
%      Returns mu = 1xn row vector
numberOfColumnsInX_norm = columns(X_norm);%column in x(features)

for i = 1:numberOfColumnsInX_norm, 
	meanofx = mean(X(:, i));
	mu(:, i) = meanofx
	X_norm(:, i) = X_norm(:, i) .- mu(:, i);
	stdev = std(X(:, i));%standard deviation
	sigma(:, i) = stdev;
	X_norm(:, i) = X_norm(:, i) ./ sigma(:, i);
   
end

end
