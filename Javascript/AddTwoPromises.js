/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function (promise1, promise2) {      //O(max(promise1,promise2]))
    try {   //Promise.all() concurrently running all promises 
        const [res1, res2] = await Promise.all([promise1, promise2]);
        return res1 + res2;
    } catch (error) {
        console.error(error);
        throw error;
    }
};

var addTwoPromises_2 = async function (promise1, promise2) {      //leet code says: O(max(promise1,promise2])) but i think its O(promise1+promise2)
    try {      //awaiting the promises one after the other
        return await promise1 + await promise2;
    } catch (error) {
        console.error(error);
        throw error;
    }
};

var addTwoPromises_3 = async function (promise1, promise2) {      //leet code says: O(max(promise1,promise2])) but i think its O(promise1+promise2)
    try {      //using .then to await promise1's result and then await promise2's result and sum them
        return promise1.then((val) => promise2.then((val2) => val + val2))
    } catch (error) {
        console.error(error);
        throw error;
    }
};

var addTwoPromises_3 = async function (promise1, promise2) {      //leet code says: O(promise1 + promise2)
    return new Promise((resolve, reject) => {
        let count = 2;
        let res = 0;

        [promise1, promise2].forEach(async promise => {
            try {
                const subRes = await promise;
                res += subRes;
                count--;

                if (count === 0) {
                    resolve(res);
                }
            } catch (err) {
                reject(err);
            }
        });
    });
};